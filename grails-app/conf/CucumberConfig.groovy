cucumber {
    tags = ["~@wip"]
    features = ["test/cucumber"]
    glue = ["test/steps"]
    formats = [ "html:target/test-reports/cucumber" ]
    strict = true
}
