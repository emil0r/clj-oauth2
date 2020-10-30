(def dev-dependencies
  '[[ring "1.8.0"]])

(defproject emil0r/clj-oauth2 "0.6.0"

  :description "clj-http and ring middlewares for OAuth 2.0 [fork]"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cheshire "5.10.0"]
                 [clj-http "3.10.3"]
                 [uri "1.1.0"]
                 [commons-codec/commons-codec "1.15"]]

  :exclusions   [org.clojure/clojure-contrib]

  :dev-dependencies ~dev-dependencies

  :profiles {:dev {:dependencies ~dev-dependencies}}

  :aot [clj-oauth2.OAuth2Exception
        clj-oauth2.OAuth2StateMismatchException])
