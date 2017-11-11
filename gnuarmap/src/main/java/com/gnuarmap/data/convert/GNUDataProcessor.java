package com.gnuarmap.data.convert;

import com.gnuarmap.data.DataHandler;

import org.json.JSONException;

import com.gnuarmap.POIMarker;

import org.mixare.lib.HtmlUnescape;
import org.mixare.lib.marker.Marker;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazunamoe on 2017-11-09.
 */

public class GNUDataProcessor extends DataHandler implements DataProcessor {

    @Override
    public String[] getUrlMatch() {
        String[] str = new String[0]; //only use this data source if all the others don't match
        return str;
    }

    @Override
    public String[] getDataMatch() {
        String[] str = new String[0]; //only use this data source if all the others don't match
        return str;
    }

    @Override
    public boolean matchesRequiredType(String type) {
        return true; //this datasources has no required type, it will always match.
    }

    @Override
    public List<Marker> load(String rawData, int taskId, int colour) throws JSONException {
        List<Marker> markers = new ArrayList<Marker>();
        int max = 1;
        for (int i = 0; i < max; i++) {

            Marker ma = null;
                String id = "0";
                String link="http://anse.gnu.ac.kr/anse/main.do";


                ma = new POIMarker(
                        id,
                        HtmlUnescape.unescapeHTML(("개척교"), 0),
                        35.152505,
                        128.104325,
                        56,
                        link,
                        0, android.R.color.black);

                markers.add(ma);
        }
        return markers;
    }



}