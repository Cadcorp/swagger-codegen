# Cadcorp: Building Swagger Codegen

1. Download Maven binaries and add to `PATH` to get `mvn -v` runnable.
2. Delete `%USERPROFILE%\.m2\repository\io\swagger` directory
3. Build Swagger Codegen Generators:

    ```
    git clone https://github.com/Cadcorp/swagger-codegen-generators.git
    cd  swagger-codegen-generators
    mvn clean install -DskipTests
    ```

    The JAR should be deployed as
    `%USERPROFILE%\.m2\repository\io\swagger\codegen\v3\swagger-codegen-generators\1.0.20-CADCORP\swagger-codegen-generators-1.0.20-CADCORP.jar`
    using Cadcorp-specific version name which is just different from version of the latest release.

4. Build Swagger Codegen:
    
    ```
    git clone https://github.com/Cadcorp/swagger-codegen.git
    cd  swagger-codegen
    mvn clean package install -DskipTests
    ```

    The JAR with CLI executable should be deployed as
    `%USERPROFILE%\.m2\repository\io\swagger\codegen\v3\swagger-codegen-cli\3.0.20-CADCORP\swagger-codegen-cli-3.0.20-CADCORP.jar`
    as well as in `.\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar`.
    Copy either over to location where you will run it from using `java -jar swagger-codegen-cli.jar`.

After modifying (e.g. fixing) any `.mustache` files in `src\main\resources\handlebars\python\`
and `src\main\resources\mustache\python\` repeat the steps 3 and 4 to update the executable,
then use that executable to re-generate client libraries.
