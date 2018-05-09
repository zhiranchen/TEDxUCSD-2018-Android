package com.ls.ui.drawer;

import android.content.Context;

import com.ls.drupalcon.R;
import com.ls.drupalcon.app.App;

import java.util.ArrayList;
import java.util.List;

public class DrawerMenu {
    public static final int MY_SCHEDULE_POSITION = 4;

    public static List<DrawerMenuItem> getNavigationDrawerItems() {
        List<DrawerMenuItem> result = new ArrayList<>();
        result.add(new DrawerMenuItem(R.string.Sessions, R.drawable.menu_icon_program, R.drawable.menu_icon_program_sel, EventMode.Program, false));
        //result.add(new DrawerMenuItem(R.string.bofs, R.drawable.menu_icon_bofs, R.drawable.menu_icon_bofs_sel, EventMode.Bofs, false));
        //result.add(new DrawerMenuItem(R.string.social_events, R.drawable.menu_icon_social_events, R.drawable.menu_icon_social_events_sel, EventMode.Social, false));
        //result.add(new DrawerMenuItem(R.string.social_media, R.drawable.menu_icon_social_media, R.drawable.menu_icon_social_media_sel, EventMode.SocialMedia, true));
        //result.add(new DrawerMenuItem(R.string.my_schedule, R.drawable.menu_icon_my_schedule, R.drawable.menu_icon_my_schedule_sel, EventMode.Favorites, false));
        //result.add(new DrawerMenuItem(R.string.floor_plan, R.drawable.menu_icon_floor_plan, R.drawable.menu_icon_floor_plan_sel, EventMode.FloorPlan, false));
        result.add(new DrawerMenuItem(R.string.location, R.drawable.menu_icon_location, R.drawable.menu_icon_location_sel, EventMode.Location, false));
        result.add(new DrawerMenuItem(R.string.speakers, R.drawable.menu_icon_speakers, R.drawable.menu_icon_speakers_sel, EventMode.Speakers, true));
        result.add(new DrawerMenuItem(R.string.about, R.drawable.menu_icon_about, R.drawable.menu_icon_about_sel, EventMode.About, false));

        return result;
    }

    public static DrawerMenuItem getMyScheduleDrawerMenuItem(){
        return getNavigationDrawerItems().get(MY_SCHEDULE_POSITION);
    }
}
