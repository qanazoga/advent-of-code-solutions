(ns advent.core
  (:gen-class))

(defn ^:dynamic part-one [input] nil)
(defn ^:dynamic part-two [input] nil)

(defn prompt [s]
        (do (println s)
            (flush)
            (read-line)))

(defn -main
  "dynamic answer loader for quick checks.
  namespace and files should be in the format advent.year.day
  dynamic loading of files /can/ be dangerous, but year and day are forced to be ints, which should deter nefarians"
  [& args]
  (let [[year day input] args
    
        year (Integer/parseInt (or year 
                                   (prompt "What year would you like to see?")))
       
        day (Integer/parseInt (or day
                                  (prompt "What day would you like to see?")))
                              
        input (or input
                  (prompt "Provide input"))
        
        file (clojure.java.io/file (format "./src/advent/%d/%d.clj" year day))]

    (if (.exists file)
      (do
        (load-file (.getPath file))
        (println (format "part-one answer: %s%npart-two answer: %s"
                         ((find-var (symbol (format "advent.%d.%d/part-one" year day))) input) 
                         ((find-var (symbol (format "advent.%d.%d/part-two" year day))) input))))
      (throw (Exception. (format "No file found for advent.%d.%d" year day))))))

