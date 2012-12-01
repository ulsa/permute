(ns permute.core
  (:use [clojure.math.combinatorics :only (selections)]))

(defn ^:export sel-index
  "First calculate all permutations of the string s, then return the one
 at index i. Permutations are the 1 to n selections of s, where n is the
 length of s."
  [s i]
  (apply str
         (when (seq s)
           (nth
            (mapcat (partial selections s)
                    (range 1 (inc (count s))))
            i))))

(defn noop [] nil)

(set! *main-cli-fn* noop)