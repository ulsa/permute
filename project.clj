(defproject permute "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU Lesser General Public License"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :plugins [[lein-cljsbuild "0.2.9"]]
  :source-paths ["comp/clojurescript/src/clj"
                 "comp/clojurescript/src/cljs"]
  :cljsbuild
    {:builds
      [{:source-path "src/cljs"
        :compiler
          {:output-to "lib/core.js"
           :optimizations :simple
           :pretty-print true
           :target :nodejs}}]})
