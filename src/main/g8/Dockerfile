from java:8

COPY target/$name$.jar /var/lib/$name$/$name$.jar
COPY docker-entrypoint.sh /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
