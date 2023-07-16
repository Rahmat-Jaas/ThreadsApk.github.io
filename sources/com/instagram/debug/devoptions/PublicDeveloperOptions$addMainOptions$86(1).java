package com.instagram.debug.devoptions;

import X.AnonymousClass0LU;
import X.C14030oh;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class PublicDeveloperOptions$addMainOptions$86 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;

    public PublicDeveloperOptions$addMainOptions$86(FragmentActivity fragmentActivity) {
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1065437974);
        try {
            Class<?> cls = Class.forName("com.instagram.api.visualizer.RequestVisualizerController");
            cls.getMethod("show", new Class[]{Activity.class}).invoke(cls.getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.$fragmentActivity}), new Object[]{this.$fragmentActivity});
            C14030oh.A0C(479807641, A05);
        } catch (Exception e) {
            AnonymousClass0LU.A0E(PublicDeveloperOptions.TAG, "Class load issues for RequestVisualizerController", e);
            RuntimeException runtimeException = new RuntimeException(e);
            C14030oh.A0C(222115279, A05);
            throw runtimeException;
        }
    }
}
