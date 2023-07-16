package com.instagram.react.modules.product;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass3Za;
import X.AnonymousClass7CL;
import X.C10300i6;
import X.C10450iM;
import X.C108366iF;
import X.C145858lE;
import X.C18170wI;
import X.C18230wP;
import X.C28174Ezk;
import X.C31155GhB;
import X.C32165H8c;
import X.C38922Kim;
import X.C63833iQ;
import X.C85814vo;
import X.C86124wJ;
import X.C95025ye;
import X.H1T;
import X.I17;
import X.IPD;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "IGCommentModerationReactModule")
public class IgReactCommentModerationModule extends NativeIGCommentModerationReactModuleSpec {
    public static final String ERROR_SERVER_ERR = "E_SERVER_ERR";
    public static final String MODULE_NAME = "IGCommentModerationReactModule";
    public C10300i6 mSession;

    public void fetchBlockedCommenters(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentAudienceControlType(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentCategoryFilterDisabled(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentFilter(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentFilterKeywords(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public void fetchCurrentUser(C145858lE r2) {
        r2.resolve((Object) null);
    }

    public String getName() {
        return "IGCommentModerationReactModule";
    }

    public static ParcelableCommenterDetails getParcelableCommenterDetails(HashMap hashMap) {
        return new ParcelableCommenterDetails((String) hashMap.get(C63833iQ.A07(800, 8, 105)), (String) hashMap.get("full_name"), (String) hashMap.get("profile_pic_url"), (String) hashMap.get("profile_pic_id"), C86124wJ.A00(hashMap.get("pk")), AnonymousClass0wJ.A1X(hashMap.get("is_verified")), AnonymousClass0wJ.A1X(hashMap.get("is_private")));
    }

    private void scheduleTask(C32165H8c h8c, C145858lE r4) {
        h8c.A00 = new IDxACallbackShape36S0200000_2_I2(12, this, r4);
        C31155GhB.A03(h8c);
    }

    public void setBlockedCommenters(ReadableMap readableMap, C145858lE r7) {
        String A00 = C28174Ezk.A00(119);
        try {
            JSONObject A0y = C18230wP.A0y();
            if (readableMap.hasKey("block")) {
                A0y.put("block", new JSONArray(readableMap.getArray("block").toArrayList()));
            }
            if (readableMap.hasKey(A00)) {
                A0y.put(A00, new JSONArray(readableMap.getArray(A00).toArrayList()));
            }
            H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
            A0N.A0J(I17.A00(478));
            A0N.A0Q(I17.A00(565), A0y.toString());
            A0N.A0B(C85814vo.class, AnonymousClass3Za.class);
            A0N.A0O("container_module", I17.A00(518));
            A0N.A06();
            scheduleTask(A0N.A02(), r7);
        } catch (JSONException e) {
            C10450iM.A06("IgReactCommentModerationModule", "Failed to send block commenter request", e);
        }
    }

    public void setCommentAudienceControlType(String str, C145858lE r4) {
        H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
        A0N.A0J("accounts/set_comment_audience_control_type/");
        A0N.A0O("audience_control", str);
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
        A0S.A00 = new C95025ye(r4, this, str);
        C31155GhB.A03(A0S);
    }

    public void setCommentCategoryFilterDisabled(boolean z, C145858lE r5) {
        String str;
        H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
        A0N.A0J("accounts/set_comment_category_filter_disabled/");
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0N.A0O("disabled", str);
        scheduleTask(AnonymousClass0wJ.A0S(A0N), r5);
    }

    public void setCustomKeywords(String str, C145858lE r4) {
        H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
        A0N.A0J(AnonymousClass000.A00(282));
        A0N.A0O("keywords", str);
        scheduleTask(AnonymousClass0wJ.A0S(A0N), r4);
    }

    public void setCustomKeywordsWithDisabled(String str, boolean z, C145858lE r5) {
        H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
        A0N.A0J(AnonymousClass000.A00(282));
        A0N.A0O("keywords", str);
        A0N.A0R("disabled", z);
        scheduleTask(AnonymousClass0wJ.A0S(A0N), r5);
    }

    public void setUseDefaultKeywords(boolean z, C145858lE r5) {
        String str;
        H1T A0N = AnonymousClass0wJ.A0N(this.mSession);
        A0N.A0J(C18170wI.A00(778));
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0N.A0O(C18170wI.A00(944), str);
        scheduleTask(AnonymousClass0wJ.A0S(A0N), r5);
    }

    public IgReactCommentModerationModule(IPD ipd, C10300i6 r2) {
        super(ipd);
        this.mSession = r2;
    }

    public void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = readableArray.toArrayList().iterator();
        while (it.hasNext()) {
            A0v.add(getParcelableCommenterDetails((HashMap) it.next()));
        }
        AnonymousClass7CL.A00(new C38922Kim(fragmentActivity, new C108366iF(callback, this), this, A0v));
    }
}
