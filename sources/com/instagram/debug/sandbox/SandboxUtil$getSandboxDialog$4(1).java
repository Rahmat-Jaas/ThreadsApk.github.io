package com.instagram.debug.sandbox;

import X.AnonymousClass3h3;
import X.C09120et;
import X.C09860go;
import X.C10300i6;
import X.C18220wO;
import X.C34463IUv;
import X.C63813iO;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.instagram.realtimeclient.RealtimeClientManager;

public final class SandboxUtil$getSandboxDialog$4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C09120et $prefs;
    public final /* synthetic */ C10300i6 $session;
    public final /* synthetic */ ViewGroup $viewGroup;

    public SandboxUtil$getSandboxDialog$4(ViewGroup viewGroup, C09120et r2, Context context, C10300i6 r4) {
        this.$viewGroup = viewGroup;
        this.$prefs = r2;
        this.$context = context;
        this.$session = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SandboxUtil sandboxUtil = SandboxUtil.INSTANCE;
        sandboxUtil.processDevServerChange(this.$viewGroup, this.$prefs);
        sandboxUtil.processMqttChange(this.$viewGroup, this.$prefs);
        C09860go.A0I(this.$viewGroup);
        C63813iO.A0B(this.$context, C18220wO.A0h(this.$context, AnonymousClass3h3.A00(), RealtimeClientManager.getLatestMqttHost(C34463IUv.A00(this.$session)), 2131824969));
        dialogInterface.dismiss();
    }
}
