# permute

This is a library, written in ClojureScript, that provides a
JavaScript function `permute.core.sel_index(s, i)` for calculating the
i:th element of the 1-n selections of a given string, where n is the
length of the string. A 1 selection of `[a b]` is just `[a b]`, while
a 2 selection of `[a b]` is the cartesian product of `[a b]` and
`[a b]`, i.e. `[[a a] [a b] [b a] [b b]]`. So, `sel_index`
concatenates all 1 selections, 2 selections, etc, up to and including
the n selections, into a single lazy sequence, and then returns the
i:th element of that sequence. Note that `sel_index` works only with
strings. 

Examples:

    sel_index(\"abc\", 0) => a
    sel_index(\"abc\", 3) => aa
    sel_index(\"abc\", 15) => aba
    sel_index(\"abc\", 38) => ccc

## Usage

Compile the ClojureScript with `lein cljsbuild once`, test using the
script `bin/sel_index`:

    % bin/sel_index abc 15
    aba

The `lib` directory contains a `main.js` and a `core.js`. You can require
the `main.js` file in order to test locally (see `bin/sel_index`):

    var permute = require("lib/main.js");

If you have the module in node_modules, you can require it using the
module name, `permute`:

    var permute = require("permute");

You can then refer to the function as `permute.core.sel_index`:

    var s = "abc";
    var i = 15;
    var sels = permute.core.sel_index(s, i);
    console.log(sels);

## License

Copyright © 2012 Ulrik Sandberg

Distributed under the Eclipse Public License, the same as Clojure.
