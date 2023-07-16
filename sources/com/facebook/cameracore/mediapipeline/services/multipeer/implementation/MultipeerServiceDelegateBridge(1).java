package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.C125567dW;
import X.C142028dg;
import X.C63803iN;
import X.C91165fi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.instagram.service.session.UserSession;

public final class MultipeerServiceDelegateBridge {
    public C142028dg delegate;

    public final void sendBinaryMessage(String str, byte[] bArr, boolean z) {
        C142028dg r1 = this.delegate;
        if (r1 != null) {
            boolean booleanValue = Boolean.valueOf(z).booleanValue();
            AnonymousClass0wJ.A1N(str, bArr);
            C91165fi r0 = ((C125567dW) r1).A02;
            VideoEffectCommunicationApi videoEffectCommunicationApi = r0.A00;
            if (videoEffectCommunicationApi != null) {
                UserSession userSession = r0.A08;
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                if (C63803iN.A0E(r2, userSession, 2342158654214638247L)) {
                    booleanValue = true;
                } else if (C63803iN.A0E(r2, userSession, 36315645000354469L)) {
                    booleanValue = false;
                }
                videoEffectCommunicationApi.sendMultipeerBinaryMessage(str, bArr, booleanValue);
            }
        }
    }

    public final void sendMessage(String str, String str2, boolean z) {
        C142028dg r0 = this.delegate;
        if (r0 != null) {
            AnonymousClass0wJ.A1N(str, str2);
            C91165fi r02 = ((C125567dW) r0).A02;
            VideoEffectCommunicationApi videoEffectCommunicationApi = r02.A00;
            if (videoEffectCommunicationApi != null) {
                UserSession userSession = r02.A08;
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                if (C63803iN.A0E(r2, userSession, 2342158654214638247L)) {
                    z = true;
                } else if (C63803iN.A0E(r2, userSession, 36315645000354469L)) {
                    z = false;
                }
                videoEffectCommunicationApi.sendMultipeerMessage(str, str2, z);
            }
        }
    }

    public final void setBinaryMessageTopicHandler(String str, Object obj) {
        C142028dg r0 = this.delegate;
        if (r0 != null) {
            AnonymousClass0wJ.A1N(str, obj);
            ((C125567dW) r0).A00.put(str, obj);
        }
    }

    public final void setTopicHandler(String str, Object obj) {
        C142028dg r0 = this.delegate;
        if (r0 != null) {
            AnonymousClass0wJ.A1N(str, obj);
            ((C125567dW) r0).A01.put(str, obj);
        }
    }

    public MultipeerServiceDelegateBridge(C142028dg r1) {
        this.delegate = r1;
    }
}
