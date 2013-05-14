resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
    Resolver.ivyStylePatterns)


addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.1")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.3")

addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

