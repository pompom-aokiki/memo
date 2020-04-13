# gitコマンド  
### git clone  
git clone 〇〇〇  
### リモートブランチの一覧
git branch -a  
### ブランチ名  
git checkout -b 〇〇〇 master  
### リネーム(開いてるブランチ)  
git branch -m 〇〇〇  
### ブランチ 変更  
git checkout origin/▽▽▽  

### ブランチ 名変更  
git branch -m ▽▽▽ 〇〇〇  
  
### ほかのブランチ をローカルに取り込む  
git pull --rebase origin origin/〇〇〇 

### fetch/pullなど  
git fetch  
git merge 〇〇〇  
git pull  

### pushまえにやること  
git branch  
git   --name-only  
git add .  
git status  
git commit -a -m "〇〇〇"  
git push -u origin 〇〇〇  

### ローカルブランチの削除  
git branch -d [ブランチ名] 

### git 特定のコミットだけ消したい  
git log  
git revert コミット番号  

### ステージング前を修正前に戻す（.をファイル名にすると個別）  
git checkout .  

### スタッシュ  
スタッシュ保存  
git stash save  
スタッシュ確認  
git stash list  
スタッシュを戻す  
git stash apply stash@{0}  
スタッシュを消す  
git stash drop stash@{0}  
スタッシュを戻して消す  
git stash pop stash@{0}  

### git statusで日本語文字が文字化けする場合  
git config --global core.quotepath false  


