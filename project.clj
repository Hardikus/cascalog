(defproject cascalog/cascalog "1.4.0"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :java-fork "true"
  :javac-debug "true"
  :hooks [leiningen.hooks.javac]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [cascading/cascading-core "1.1.3"]
                 [log4j/log4j "1.2.16"]
                 ]
  :repositories {"conjars" "http://conjars.org/repo/"}
  :dev-dependencies [[lein-javac "1.2.1-SNAPSHOT"]
                     [org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [swank-clojure "1.2.1"]
                    ]
  :namespaces [cascalog.workflow
               cascalog.debug
               cascalog.api
               cascalog.playground
               cascalog.util
               cascalog.rules
               cascalog.basic-flow
               cascalog.vars
               cascalog.predicate
               cascalog.testing
               cascalog.graph
               cascalog.api
               cascalog.ops
               cascalog.ops-impl])
