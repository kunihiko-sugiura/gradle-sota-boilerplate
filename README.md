# gradle-sota-boilerplate
sota君のgradle projectをjarにbuildしsotaのアプリケーション登録する方法となります。

## 開発環境構築
mac環境を利用しています。

### Homebrew
Macのアプリケーション管理にHomebrewを利用します。
以下のurlを参照しインストールします。
https://brew.sh/index_ja.html

### Javaのインストール
brew update && brew cleanup
brew cask install java

#### インストール確認
/usr/libexec/java_home -V

#### 設定
vi .bash_profile

```
export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
```
java -version 

### Gradleのインストール
brew install gradle


## Build & Deploy

### Build only
```
gradle build
```

### Build & Deploy
```
gradle deploy
```

## Sota君のアプリケーション起動設定

```
vi /home/vstone/vstonemagic/app/jar/app.properties

length=<<アプリ数：デフォルト0>>
Debug=false
TimeZone=Asia/Tokyo

app1.title=<<アプリタイトル>>
app1.workingdir=<<実行ファイルが存在するディレクトリ>>
app1.jar=<<実行jarファイル>>
app1.type=app
app1.trigger=
app1.triggeroption=
app1.execoption=-Dfile.encoding=UTF8 -Djava.library.path=/usr/local/share/OpenCV/java/
```

再起動すると、メニューからアプリの起動が可能となります。