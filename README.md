# JApplication
Eine Application-API

Man kann mit Maven auf die API zugreifen:

(der Text muss in Raw Ansicht angesehen werden)

<repositories>
   <repository>
       <id>JApplication</id>
       <url>https://maven.pkg.github.com/GemueseHasser/JApplication</url>
   </repository>
</repositories>

<dependency>
   <groupId>de.jonas</groupId>
   <artifactId>japplication</artifactId>
   <version>VERSION</version>
   <scope>compile</scope>
</dependency>

Um Zugriff auf das Repository zu haben, muss die settings.xml editiert werden:

<server>
   <id>github</id>
   <username>USERNAME</username>
   <password>ACCESS_TOKEN</password>
</server>

<profile>
  <id>github</id>
  <repositories>
      <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
      </repository>
      <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/GemueseHasser/*</url>
          <snapshots>
              <enabled>true</enabled>
          </snapshots>
      </repository>
  </repositories>
</profile>

<activeProfiles>
    <activeProfile>github</activeProfile>
</activeProfiles>
