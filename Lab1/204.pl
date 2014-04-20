#!/usr/bin/perl
while (<>) {
    #s/\b(\w(\w)*)\b(\w(\w)*)\b/computer/;
    s/((\w)+?)((\W)+?)((\w)+?)(\W)/$5$3$1$7/;
    print;
}
