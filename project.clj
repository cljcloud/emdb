(defproject cljcloud/emdb "0.1.0"
  :description "Embedded Database for Clojure"
  :url "http://example.com/FIXME"
  :repositories [["github" {:url      "https://maven.pkg.github.com/cljcloud/emdb"
                            :username "private-token"
                            :password :env/GITHUB_TOKEN}]]
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.taoensso/nippy "3.1.3"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.compiler.elide-meta=[:doc :file :line :added]"]}})
