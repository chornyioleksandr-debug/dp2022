export interface Flower {
    name:string;
    img:string;
    description:string;
    _links:{
        self: {
            href: string;
        },
        flower: {
            href: string;
        }
    }
}
