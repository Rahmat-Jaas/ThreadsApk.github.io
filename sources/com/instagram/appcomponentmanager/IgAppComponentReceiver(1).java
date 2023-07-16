package com.instagram.appcomponentmanager;

import X.AnonymousClass01G;
import X.C08360dF;
import X.C14030oh;
import X.C14630pr;
import X.C18200wM;
import X.C18250wR;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appcomponentmanager.AppComponentManagerService;
import java.io.File;

public class IgAppComponentReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-1383463471);
        intent.getAction();
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            File A00 = C14630pr.A00(context, 1436876361);
            A00.mkdirs();
            String[] list = new File(A00, "versions").list();
            if (list == null || list.length == 0) {
                C08360dF.A01(context);
                if (C18200wM.A0h(C18200wM.A0C(), "current") == null) {
                    i = -753553021;
                    C14030oh.A0E(i, A01, intent);
                }
            }
            AnonymousClass01G.enqueueWork(context, AppComponentManagerService.class, 137875812, C18250wR.A05("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS"));
        }
        i = -1079568247;
        C14030oh.A0E(i, A01, intent);
    }
}
