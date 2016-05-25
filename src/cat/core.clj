(ns cat.core
  (:gen-class))

(defn -main
  "Reads the content of its arguments representing filenames and outputs the
  content in succession."
  [& filenames]
  (doseq [filename filenames]
    (print (slurp filename))
    (flush)))
