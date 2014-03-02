#!/usr/bin/perl
use List::MoreUtils qw(uniq);
my @links = ();
while (<>) {
    push (@links, ($_ =~ /<a [^>]*?href=\"(?:.{3,9}?:(?:\/\/)?+)?+(\w.*?)[\"\/:].*?>/g));
}
print join("\n", uniq sort @links);
