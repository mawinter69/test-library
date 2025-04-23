import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def call(String name, boolean skip, Closure body) {
  stage(name) {
    if (skip) {
      Utils.markStageSkippedForConditional(STAGE_NAME)
      return
    }
    body()
  }
}