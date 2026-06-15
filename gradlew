#!/bin/sh
APP_HOME=$(cd "$(dirname "$0")" && pwd)
APP_BASE_NAME=$(basename "$0")
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar
exec java -jar "$CLASSPATH" "$@"
