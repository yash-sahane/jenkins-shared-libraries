def call(String url, String branch){
  echo "Clong the code from github"
  git url: url, branch: branch
  echo "Code cloning successful"
}
