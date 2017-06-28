run:

time while true; do mvn clean  test > last.log ; tail -25 last.log ; if [ "$(grep -c 'Tests run: 16' last.log)" == "0" ]; then break; fi ; done

This commmand should never end, has the test count should not change.