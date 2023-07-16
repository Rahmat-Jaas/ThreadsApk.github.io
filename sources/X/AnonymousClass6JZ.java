package X;

import com.instagram.api.schemas.AudioMetadataLabels;

/* renamed from: X.6JZ  reason: invalid class name */
public final class AnonymousClass6JZ {
    public static final AudioMetadataLabels A00(String str) {
        AudioMetadataLabels audioMetadataLabels = (AudioMetadataLabels) AudioMetadataLabels.A01.get(str);
        if (audioMetadataLabels == null) {
            return AudioMetadataLabels.UNRECOGNIZED;
        }
        return audioMetadataLabels;
    }
}
