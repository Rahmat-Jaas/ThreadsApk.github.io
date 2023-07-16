package com.facebook.graphql.query;

import X.AnonymousClass00U;
import X.C145828l9;
import X.C18230wP;
import X.C18250wR;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONPersistedQueryProvider implements C145828l9 {
    public final JSONObject A00;

    public final String persistIdForQuery(String str) {
        return null;
    }

    public final String clientDocIdForQuery(String str) {
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                return jSONObject.getString("client_doc_id");
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return null;
    }

    public final String schemaForQuery(String str) {
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                return jSONObject.getString("schema");
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return null;
    }

    public JSONPersistedQueryProvider(Context context, String str) {
        JSONObject jSONObject;
        try {
            InputStream open = context.getAssets().open(AnonymousClass00U.A0L(str, "_client_persist_ids.json"));
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            jSONObject = C18250wR.A0j(new String(bArr, "UTF-8"));
        } catch (IOException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
            jSONObject = C18230wP.A0y();
        }
        this.A00 = jSONObject;
    }
}
