package com.williamhill.us.api;

import com.google.gson.annotations.SerializedName;

@lombok.Data
class Data {
  private int id;
  private String email;

  @SerializedName(value = "first_name")
  private String firstName;

  @SerializedName(value = "last_name")
  private String lastName;
  private String avatar;
}
