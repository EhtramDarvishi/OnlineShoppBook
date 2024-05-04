package com.example.onlineshopebook.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UserResponse {
    private final long id;
    private final String userName;

//    public static Builder builder(){
//       return new Builder();
//    }
//    public static class Builder{
//        private  long id;
//        private  String userName;
//       public Builder id(long id){
//           this.id = id;
//           return this;
//       }
//        public Builder userName(String userName){
//            this.userName = userName;
//            return this;
//        }
//
//        public UserResponse build(){
//           return new UserResponse(id,userName);
//        }
//
//    }
}
