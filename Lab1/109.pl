#!/usr/bin/perl
while (<>) {
    print if /(^$|^.$|^[^\s](.)*[^\s]$)/;
}
