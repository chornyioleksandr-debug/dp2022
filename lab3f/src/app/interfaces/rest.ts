
import { Flower } from "./flower"

export interface Rest {
    _embedded: {
        flowers: Flower[]
    },
    _links: {
        self: {
            href: string;
        },
        profile: {
            href: string;
        }
    },
    page: {
        size: number,
        totalElements: number,
        totalPages: number,
        number: number
    }
}