package com.fury.tiktoksample.animations.animation;

import android.animation.TimeInterpolator;

/**
 * Created by danielzeller on 14.04.15.
 */
public class CircInOut implements TimeInterpolator {

    @Override
    public float getInterpolation(float t) {
        if ((t *= 2) < 1) return -0.5f * ((float) Math.sqrt(1 - t * t) - 1);
        return 0.5f * ((float) Math.sqrt(1 - (t -= 2) * t) + 1);
    }
}
