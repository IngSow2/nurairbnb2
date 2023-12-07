
module.exports = {
  '**/*.java': ['./gradlew spotlessApply', 'git add'],
};