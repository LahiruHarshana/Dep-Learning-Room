import * as fs from 'node:fs/promises';
import * as Path from "node:path";
const projectPath = process.cwd();
await createDepDirectory();
await createDepDirectory();
await createDepDirectory();
await createDepDirectory();
await createDepDirectory();
async function createDepDirectory() {
    try {
        let l = 1;
        for (let i = 1; i < 100; i++) {
            if (await exists(Path.resolve(process.cwd(), `Dep-${i}`))) {
                l = (i + 1);
            }
        }
        await fs.mkdir(Path.resolve(process.cwd(), `Dep-${l}`));
    }
    catch (e) {
    }
}
async function exists(path) {
    try {
        await fs.access(path);
        return true;
    }
    catch (e) {
        return false;
    }
}
async function dropDepDirectory() {
}
//# sourceMappingURL=main.js.map