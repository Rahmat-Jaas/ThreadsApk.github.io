package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.C04220Ms;
import X.C125577dX;
import X.C142038dh;
import X.C91165fi;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import java.util.List;

public final class ParticipantServiceDelegateBridge {
    public C142038dh delegate;

    public final ParticipantData getCurrentUserDataSnapshot() {
        C142038dh r0 = this.delegate;
        if (r0 == null) {
            return null;
        }
        C91165fi r02 = ((C125577dX) r0).A01;
        String str = r02.A05;
        if (str == null) {
            str = r02.A08.getUserId();
        }
        return new ParticipantData(str, true, true, 1);
    }

    public final List getPeersDataSnapshot() {
        C142038dh r0 = this.delegate;
        if (r0 != null) {
            return ((C125577dX) r0).A01.A06;
        }
        return null;
    }

    public final void setParticipantUpdateHandler(Object obj) {
        C142038dh r1 = this.delegate;
        if (r1 != null) {
            ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid = (ParticipantUpdateHandlerHybrid) obj;
            C04220Ms.A0B(participantUpdateHandlerHybrid, 0);
            ((C125577dX) r1).A00 = participantUpdateHandlerHybrid;
        }
    }

    public ParticipantServiceDelegateBridge(C142038dh r1) {
        this.delegate = r1;
    }
}
