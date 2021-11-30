(ns advent.2015.1)

(defn part-one [input]
  (let [f (frequencies input)] 
    (- (-> f first val) (-> f second val))))

(defn part-two 
  "I didn't really like doing loops so I made it recursive"
  ([input] 
   (part-two input 0 0))
  
  ([input pos floor]
   (if (= -1 floor)
     pos
     (part-two (rest input) 
                    (inc pos) 
                    (if (= \( (first input))
                      (inc floor)
                      (dec floor))))))
  
;(alter-var-r)
