(ns advent.2021.1)

(defn part-one [input] 
  (loop [input input
         i 0
         p (first input)]
    (if (empty? input)
      i
      (recur (rest input)
             (if (< p (first input))
               (inc i)
               i)
             (first input)))))

(defn part-two [input]
  (loop [input input
         i 0
         p (apply + (take 3 input))]
    
    (if (> 3 (count input))
      i
      (recur (rest input)
             (if (< p (apply + (take 3 input)))
               (inc i)
               i)
             (apply + (take 3 input))))))

