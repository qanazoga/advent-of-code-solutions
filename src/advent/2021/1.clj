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

(defn- third [input] (-> input rest second))

(defn part-two [input]
  (loop [input input
         i 0
         p (+ (first input) (second input) (third input))]
    
    (if (> 3 (count input))
      i
      (recur (rest input)
             (if (< p (+ (first input) (second input) (third input)))
               (inc i)
               i)
             (+ (first input) (second input) (third input))))))
