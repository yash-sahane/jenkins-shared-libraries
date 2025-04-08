def call(String url, String branch){
  echo "Clong the code"
  git url: url, branch: branch
  echo "Code cloning successful"
}
