package com.ls.drupalconapp.model.requests;

import com.ls.drupal.AbstractDrupalEntityContainer;
import com.ls.drupal.DrupalClient;
import com.ls.drupalconapp.model.data.Level;
import com.ls.http.base.BaseRequest;
import com.ls.http.base.ResponseData;

import java.util.Map;

/**
 * Created on 09.06.2015.
 */
public class LevelsRequest extends AbstractDrupalEntityContainer<Level.Holder> {

    public LevelsRequest(DrupalClient client) {
        super(client, new Level.Holder());
    }

    @Override
    protected String getPath() {
        return "getLevels";
    }

    @Override
    protected Map<String, String> getItemRequestPostParameters() {
        return null;
    }

    @Override
    protected Map<String, Object> getItemRequestGetParameters(BaseRequest.RequestMethod method) {
        return null;
    }

    @Override
    protected void consumeObject(ResponseData entity) {
        if(entity != null) {
            super.consumeObject(entity);
        }
    }
}
