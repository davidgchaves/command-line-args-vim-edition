(ns command-line-args-vim-edition.core-test
  (:require [clojure.test :refer :all]
            [command-line-args-vim-edition.core :refer :all]))

(deftest pairs-of-values
  (let [args ["--server" "localhost"
              "--port" "8080"
              "--environment" "production"]]
    (is (= {:server "localhost"
            :port "8080"
            :environment "production"}
           (parse-args args)))))
