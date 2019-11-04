plugins {
  id("org.danilopianini.gradle-latex") version "0.1.1"
}

latex {
    "elsarticle-template" {
        bib = "mybibfile.bib"
    }
}
