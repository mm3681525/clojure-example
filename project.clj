(defproject clojure_example "0.1.0-SNAPSHOT"
  :description "An example project demonstrating how to build a REST API in Clojure"
  :url "https://innovationgroup.tech"
  :license {:name "MIT"
    :url "https://github.com/kenreilly/clojure-example/blob/master/LICENSE"}
  :dependencies [
    [org.clojure/clojure "1.11.1"]
    [org.clojure/data.json "2.4.0"]
    [org.clojure/java.jdbc "0.7.12"]
    [org.postgresql/postgresql "42.4.1"]
    [ring/ring-defaults "0.3.3"]
    [ring/ring-devel "1.9.5"]
    [ring/ring-json "0.5.1"]
    [compojure "1.7.0"]
    [http-kit "2.6.0"]
    [lynxeyes/dotenv "1.1.0"]]
  :plugins [[lein-ancient "0.6.15"]
          [lein-test-report "0.2.0"]
          [lein-test-report-junit-xml "0.2.0"]
          [jonase/eastwood "1.2.4"]
          [lein-cloverage "1.0.13"]
          [lein-kibit "0.1.6"]
          [lein-nvd "0.6.0"]]
  :main ^:skip-aot clojure-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:main clojure-example.core/-dev-main}})
