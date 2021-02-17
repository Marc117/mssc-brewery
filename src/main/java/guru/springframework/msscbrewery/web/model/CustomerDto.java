package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private UUID id;
    private String customerName;

    public static CustomerDtoBuilder builder() {
        return new CustomerDtoBuilder();
    }

    public static class CustomerDtoBuilder {
        private UUID id;
        private String customerName;

        CustomerDtoBuilder() {
        }

        public CustomerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerDtoBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(id, customerName);
        }

        public String toString() {
            return "CustomerDto.CustomerDtoBuilder(id=" + this.id + ", customerName=" + this.customerName + ")";
        }
    }
}
