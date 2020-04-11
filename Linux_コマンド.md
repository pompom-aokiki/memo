LinuxにChormeをインストール  
https://www.google.com/intl/ja_jp/chrome/  
  
ダウンロードフォルダにて以下を実行(上でいインストールした[***.rpm])  
sudo rpm -ivh google-chrome-stable_current_x86_64.rpm  
  
※「依存関係の欠如」が発生した場合、以下のコマンドで必要なものを一括でインストールする  
sudo yum whatprovides 〇〇〇.rpm  
  


  