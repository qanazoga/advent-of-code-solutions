(defproject advent "0.1.0-SNAPSHOT"
  :description "solutions to advent of code"
  :url "https://gitlab.com/qanazoga/advent-of-code-solutions/"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot advent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
