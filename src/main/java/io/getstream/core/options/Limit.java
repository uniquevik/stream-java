package io.getstream.core.options;

import static com.google.common.base.Preconditions.checkArgument;

import io.getstream.core.http.Request;

public final class Limit implements RequestOption {
  private final int limit;

  public Limit(int value) {
    checkArgument(value >= 0, "limit can't be negative");
    limit = value;
  }

  @Override
  public void apply(Request.Builder builder) {
    builder.addQueryParameter("limit", Integer.toString(limit));
  }
}
