#!/bin/bash

CP="target/test-classes"

echo "=== Запуск усіх тестів з $CP ==="

# Знайти всі файли *.class, виключити внутрішні класи ($'$', наприклад, анонімні)
find "$CP" -name "*.class" ! -name "*\$*" | while read -r classfile; do
  # Відрізати початок шляху і розширення, замінити / на .
  classname=$(echo "$classfile" | sed "s|^$CP/||" | sed 's|/|.|g' | sed 's|\.class$||')

  echo "=== Запуск: $classname ==="
  java -cp "$CP" "$classname"
  echo ""
done