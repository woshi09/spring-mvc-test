package com.spring.test.model;

import java.util.List;

/**
 * Created by guixinyuan on 16/3/11.
 */
public class WmPoiShippingInfoVo {
    private Long wm_poi_id;
    private Long latitude;
    private Long longitude;
    private List<WmPoiSpScheme> wmPoiSpSchemes;

    public List<WmPoiSpScheme> getWmPoiSpSchemes() {
        return wmPoiSpSchemes;
    }

    public void setWmPoiSpSchemes(List<WmPoiSpScheme> wmPoiSpSchemes) {
        this.wmPoiSpSchemes = wmPoiSpSchemes;
    }

    public static class WmPoiSpScheme{
        private String name = "默认方案";
        private List<WmPoiSpArea> wmPoiSpAreas;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<WmPoiSpArea> getWmPoiSpAreas() {
            return wmPoiSpAreas;
        }

        public void setWmPoiSpAreas(List<WmPoiSpArea> wmPoiSpAreas) {
            this.wmPoiSpAreas = wmPoiSpAreas;
        }
    }

    public Long getWm_poi_id() {
        return wm_poi_id;
    }

    public void setWm_poi_id(Long wm_poi_id) {
        this.wm_poi_id = wm_poi_id;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}
