/*
package com.java.coding.interview.java21;

import java.util.FormatProcessor;

public class StringTemplateExample {

    public static void main(String[] args) {

        String name = "Rahul";
        //Zone zone = new Zone("Zone 1", 10.5, 20.3);
        //Zone zone = new Zone("Zone 1", 10.5, 20.3);
        Zone[] zone = new Zone[2]; // Example: Zone[] zone = new Zone[2];

        zone[0] = new Zone("Zone 1", 10.5, 20.3);
        zone[1] = new Zone("Zone 2", 15.2, 25.8);


        @SuppressWarnings("preview")
        String choice = STR."\{name} has chosen option \{name}";

        //System.out.println(choice);

        // FMT template processor
        @SuppressWarnings("preview")
        String formattedTable = FormatProcessor.FMT."""
			    Description     Width    Height     Area
			    %-12s\{zone[0].name}  %7.2f\{zone[0].width}  %7.2f\{zone[0].height}     %7.2f\{zone[0].area()}
			    %-12s\{zone[1].name}  %7.2f\{zone[1].width}  %7.2f\{zone[1].height}     %7.2f\{zone[1].area()}
			    \{" ".repeat(28)} Total %7.2f\{zone[0].area() + zone[1].area()}
			    """;

        System.out.println(formattedTable);


        /// RAW template processor
        int v = 10, w = 20;
        @SuppressWarnings("preview")
        StringTemplate rawST = StringTemplate.RAW."\{v} plus \{w} equals \{v + w}";
        java.util.List<String> fragments = rawST.fragments();
        java.util.List<Object> values = rawST.values();

        System.out.println(rawST.toString());

        fragments.stream().forEach(f -> System.out.print("[" + f + "]"));
        System.out.println();

        values.stream().forEach(val -> System.out.print("[" + val + "]"));
        System.out.println();

        System.out.println(rawST.process(STR));
        System.out.println(STR.process(rawST));
        System.out.println(rawST.interpolate());
    }

}
*/
