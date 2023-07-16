package X;

import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerBinaryMessageTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantUpdateHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5fi  reason: invalid class name and case insensitive filesystem */
public final class C91165fi extends VideoEffectCommunicationProxy {
    public VideoEffectCommunicationApi A00;
    public C125567dW A01;
    public C125577dX A02;
    public Long A03;
    public Long A04;
    public String A05;
    public List A06 = AnonymousClass0wJ.A0v();
    public final C31441Gp7 A07;
    public final UserSession A08;
    public final C36357JRp A09;

    public final void getGroupEffectConfirmationPromptState(GetGroupEffectConfirmationCompletion getGroupEffectConfirmationCompletion) {
    }

    public final void onActiveCallLayoutChanged(long j, long j2) {
    }

    public final void onCallLayoutRemoved(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z) {
    }

    public final void onReadyForSplitScreenChanged(boolean z) {
    }

    public final void onReceiveGroupEffect(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo) {
        Object next;
        C04220Ms.A0B(videoEffectCommunicationSharedEffectInfo, 0);
        long j = videoEffectCommunicationSharedEffectInfo.effectId;
        Long l = this.A03;
        if (l == null || j != l.longValue()) {
            C36357JRp jRp = this.A09;
            String str = videoEffectCommunicationSharedEffectInfo.effectName;
            String str2 = videoEffectCommunicationSharedEffectInfo.effectThumbnailUri;
            String str3 = videoEffectCommunicationSharedEffectInfo.initiatorId;
            String str4 = videoEffectCommunicationSharedEffectInfo.initiatorName;
            String str5 = videoEffectCommunicationSharedEffectInfo.cryptoHash;
            C28736FaG faG = jRp.A00.A0O;
            if (str5 == null) {
                if (!C63803iN.A0E(AnonymousClass0TJ.A05, faG.A0H.A00, 36315645000026788L)) {
                    return;
                }
            }
            C113456rS r3 = faG.A0L;
            if (!(str == null && str2 == null && str4 == null)) {
                if (str4 == null) {
                    str4 = "";
                }
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                String[] strArr = {str4, str, str2};
                Integer num = AnonymousClass006.A15;
                r3.A00.A0N(new FFG(num, AnonymousClass006.A00, strArr, System.currentTimeMillis(), false));
            }
            Integer num2 = AnonymousClass006.A01;
            Object value = faG.A0V.getValue();
            if (value != C971167z.ON && value != C971167z.PENDING && !AnonymousClass0wJ.A1X(faG.A0W.getValue())) {
                CameraAREffect cameraAREffect = null;
                FFF A002 = C28736FaG.A00(faG);
                if (str5 != null) {
                    Iterator it = A002.A0I.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                        String str6 = ((CameraAREffect) next).A0I;
                        C04220Ms.A06(str6);
                        if (Long.parseLong(str6) == j) {
                            break;
                        }
                    }
                } else {
                    Iterator it2 = A002.A0J.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        String str7 = ((CameraAREffect) next).A0I;
                        C04220Ms.A06(str7);
                        if (Long.parseLong(str7) == j) {
                            break;
                        }
                    }
                }
                cameraAREffect = next;
                CameraAREffect cameraAREffect2 = cameraAREffect;
                if (cameraAREffect2 == null) {
                    faG.A0N(num2, String.valueOf(j), str5, str3);
                } else {
                    C28736FaG.A04(cameraAREffect2, faG, num2, str3);
                }
            }
        }
    }

    public final void onVideoFrameUpdated(RSVideoFrame rSVideoFrame, String str) {
    }

    public final void setApi(VideoEffectCommunicationApi videoEffectCommunicationApi) {
        C04220Ms.A0B(videoEffectCommunicationApi, 0);
        this.A00 = videoEffectCommunicationApi;
    }

    public final void showGroupEffectConfirmationPrompt(GroupEffectConfirmationPromptCompletion groupEffectConfirmationPromptCompletion) {
    }

    public final void showUnapprovedVideoEffectAlert(UnapprovedEffectAlertCompletion unapprovedEffectAlertCompletion) {
    }

    public C91165fi(C31441Gp7 gp7, C36357JRp jRp, UserSession userSession) {
        this.A08 = userSession;
        this.A07 = gp7;
        this.A09 = jRp;
    }

    public final void onEffectParticipantsUpdated(VideoEffectCommunicationParticipant videoEffectCommunicationParticipant, ArrayList arrayList, long j) {
        ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid;
        int i;
        boolean A1Z = AnonymousClass0wJ.A1Z(videoEffectCommunicationParticipant, arrayList);
        Long l = this.A04;
        if (l != null && j == l.longValue()) {
            this.A05 = videoEffectCommunicationParticipant.participantId;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                VideoEffectCommunicationParticipant videoEffectCommunicationParticipant2 = (VideoEffectCommunicationParticipant) it.next();
                String str = videoEffectCommunicationParticipant2.participantId;
                boolean z = videoEffectCommunicationParticipant2.isActiveInCall;
                boolean z2 = videoEffectCommunicationParticipant2.isActiveInSameEffect;
                int i2 = videoEffectCommunicationParticipant2.loadStatus;
                if (i2 != 0) {
                    i = 1;
                    if (!(i2 == A1Z || i2 == 2)) {
                        if (i2 != 3) {
                            i = 2;
                            if (i2 != 4) {
                                i = 3;
                            }
                        }
                        A0v.add(new ParticipantData(str, z, z2, i));
                    }
                }
                i = 0;
                A0v.add(new ParticipantData(str, z, z2, i));
            }
            this.A06 = A0v;
            C125577dX r0 = this.A02;
            if (r0 != null && (participantUpdateHandlerHybrid = r0.A00) != null) {
                participantUpdateHandlerHybrid.onParticipantDataUpdateNative(A0v);
            }
        }
    }

    public final void onMultipeerBinaryMessage(String str, byte[] bArr) {
        MultipeerBinaryMessageTopicHandlerHybrid multipeerBinaryMessageTopicHandlerHybrid;
        AnonymousClass0wJ.A1N(str, bArr);
        C125567dW r0 = this.A01;
        if (r0 != null && (multipeerBinaryMessageTopicHandlerHybrid = (MultipeerBinaryMessageTopicHandlerHybrid) r0.A00.get(str)) != null) {
            multipeerBinaryMessageTopicHandlerHybrid.onMessageNative(bArr);
        }
    }

    public final void onMultipeerMessage(String str, String str2) {
        MultipeerTopicHandlerHybrid multipeerTopicHandlerHybrid;
        AnonymousClass0wJ.A1N(str, str2);
        C125567dW r0 = this.A01;
        if (r0 != null && (multipeerTopicHandlerHybrid = (MultipeerTopicHandlerHybrid) r0.A01.get(str)) != null) {
            multipeerTopicHandlerHybrid.onMessageNative(str2);
        }
    }
}
