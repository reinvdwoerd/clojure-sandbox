(defproject reinvdwoerd/sandbox "SNAPSHOT"
  :description ""
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.494"]
                 [org.clojure/core.incubator "0.1.4"]
                 [org.clojure/core.async "0.2.395"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [compojure "1.6.0-beta3"]
                 [http-kit "2.3.0-alpha1"]
                 [prismatic/schema "1.1.3"]
                 [com.rpl/specter "1.0.0"]
                 [instaparse "1.4.5"]
                 [mount "0.1.11"]
                 [jarohen/chord "0.8.1"]
                 [alandipert/storage-atom "1.2.4"]
                 [egamble/let-else "1.0.7"]
                 [me.bsima/trello "0.3.0"]
                 [im.chit/hara.time "2.5.2"]
                 [clj-time "0.13.0"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:source-paths ["src" "test"]
                       :dependencies [[midje "1.9.0-alpha6"]
                                      [org.clojure/test.check "0.9.0"]
                                      [proto-repl "0.3.1"]]}})
